// "static void main" must be defined in a public class.
class stack{
  private int[] arr;
  public static int front;
   int rear;
   int size;
     stack(){
         arr=new int[5];
         front=-1;
         rear=-1;
         size=0;
     }
    private  void doublecapacity(){
       int temp[]=arr;
       arr=new int[temp.length*2];
       int index=0;
       for(int i=front;i<arr.length;i++){
           arr[index++]=temp[i];
       }
       for(int i=0;i<front;i++){
           arr[index++]=temp[i];
       }
   }
    public void push(int val){
        if(rear==arr.length){
            doublecapacity();
        }
        if(rear==-1){
        front=0;
        }
        rear++;
        if(rear==arr.length){
            rear=0;
        }
        arr[rear]=val;
        size++;
    }
    public int pop(){
        if(isEmpty()){
            return -1;
        }
        int temp=arr[front];
        front++;
        if(front==arr.length){
            front=0;
        }
      size--;
      return temp;
    }
    public int peek(){
        if(isEmpty()){
            return -1;
        }
        return arr[front];
    }
    public boolean isEmpty(){
        return size==0;
    }
    
    public static void main(String[] args) {
       stack s=new stack();
       System.out.println(s.isEmpty());
       s.push(2);
       s.push(3);
       System.out.println(s.peek());
       System.out.println(s.isEmpty());
       System.out.println(s.pop());
       System.out.println(s.peek());
       System.out.println(s.pop());
       System.out.println(s.peek());
       System.out.println(s.isEmpty());
    }
}