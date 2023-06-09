public class minHeap {
    public static void main(String args[]){
minHeap a=new minHeap();
int[] arr={12,34,56,78,23};
a.insertNewValue(arr[0]);
a.insertNewValue(arr[1]);
a.insertNewValue(arr[2]);
a.insertNewValue(arr[3]);
a.insertNewValue(arr[4]);
// System.out.println(a.getMax());
// a.removeMax();
System.out.println(a.getMax());
a.insertNewValue(2);
System.out.println(a.getMax());

    }
    int size;
    int[] arr= new int[20];
//INSERT A NEW VALUE
    public void insertNewValue(int val){
  arr[size]=val;
int index=size;
int parent=(index-1)/2;

while(parent>=0 && arr[parent]>arr[index]){
    int t=arr[parent];
    arr[parent]=arr[index];
    arr[index]=t;

    t=parent;
    index=parent;
    parent=(t-1)/2;
}
size++;
    }
 //GET MAX VALUE   
    public int getMax(){
        return arr[0];
    }

//REMOVE MAX VALUE    
    public int removeMax(){
int max=arr[0];
arr[0]=arr[size-1];
size=size-1;
maxHeapify(0);
return max;
    }
    public void maxHeapify(int index){
int l;
int r;
l=2*index+1;
r=2*index+2;

int largest=index;
if(l<this.size &&arr[l]< arr[largest]){
    largest=l;
}
if(r<this.size &&arr[r]<arr[largest]){
    largest=r;
}
if(largest!= index){
    int t=arr[largest];
    arr[largest]=arr[index];
    arr[index]=t;

    maxHeapify(largest);
}
    }
}

