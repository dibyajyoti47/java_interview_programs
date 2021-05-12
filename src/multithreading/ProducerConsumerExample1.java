package multithreading;

import java.util.Stack;

public class ProducerConsumerExample1 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        new Producer(stack).start();
        new Consumer(stack).start();
    }
}

class Producer extends Thread {
    Stack<Integer> stack;
    Producer (Stack<Integer> stack) {
        this.stack = stack;
    }
    public void run () {
        while (true) {
            if(this.stack.empty()) {
                System.out.println("Stack is empty");
                synchronized (this.stack) {
                    for (int i=1; i<=3;i++) {
                        try {Thread.sleep(500);} catch (InterruptedException e) {}
                        this.stack.add(i);
                        System.out.println("produced "+ i);
                    }
                    this.stack.notifyAll();
                }
            }
        }
    }
}

class Consumer extends Thread {
    Stack<Integer> stack;
    Consumer (Stack<Integer> stack) {
        this.stack = stack;
    }
    public void run () {
        while (true) {
            synchronized (this.stack) {
                try {Thread.sleep(100);} catch (InterruptedException e) {}
                System.out.println("consumed : "+this.stack.pop());
                if(this.stack.empty()) {
                    try { this.stack.wait(); } catch (InterruptedException e) {}
                }
            }
        }
    }
}