class MyCircularQueue{
    int[] arr;
    int size,capacity,front,rear;
    public MyCircularQueue(int k){
        arr=new int[k];
        size=0;
        front=0;
        rear=-1;
        capacity=k;
    }
    public boolean enQueue(int value){
        if(size==capacity) return false;
        rear=(rear+1)%capacity;
        arr[rear]=value;
        size++;
        return true;
    }
    public boolean deQueue(){
        if(size==0) return false;
        front=(front+1)%capacity;
        size--;
        return true;
    }
    public int Front(){
        if(size==0) return -1;
        return arr[front];
    }
    public int Rear(){
        if(size==0) return -1;
        return arr[rear];
    }
    public boolean isEmpty(){
        if(size==0){
            return true;
        }else{
            return false;
        }
    }
    public boolean isFull(){
        if(size==capacity){
            return true;
        }else{
            return false;
        }
    }
}