package DS;

import java.util.ArrayList;

//implementation of stack using arraylist

class StackAL {
    static class Stack{
        ArrayList<Integer> list= new ArrayList<>();

        public void push(int data){
            list.add(data);
        }

        public boolean isEmpty(){
            return list.size()==0;
        }

        public int pop(){
            if(isEmpty()){
                return -1;
            }
            int top=list.remove(list.size()-1);
            return top;
        }

        public int peek(){
            if(isEmpty()){
                return -1;
            }
            return list.get(list.size()-1);
        }
    }

    public static void main(String[] args) {
        Stack stack =new Stack();
        stack.push(1);
        stack.push(3);

        while(!stack.isEmpty()) {
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}
