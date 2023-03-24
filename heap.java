public class heap {
    public static void main(String args[]){
heap a=new heap();

a.insertNewValue(12);
a.insertNewValue(34);
a.insertNewValue(67);
a.insertNewValue(69);
a.insertNewValue(23);
// System.out.println(a.getMax());
// a.removeMax();
System.out.println(a.getMax());
a.insertNewValue(200);
System.out.println(a.getMax());

    }
    int size;
    int[] arr= new int[20];
//-------------------------------------------------------------------------INSERT A NEW VALUE----------------------------------------------------------------
    public void insertNewValue(int val){
  arr[size]=val;
int index=size;
int parent=(index-1)/2;

while(parent>=0 && arr[parent]<arr[index]){
    int t=arr[parent];
    arr[parent]=arr[index];
    arr[index]=t;

    t=parent;
    index=parent;
    parent=(t-1)/2;
}
size++;
    }
 //---------------------------------------------------------------------------GET MAX VALUE------------------------------------------------------------------   
    
 
 public int getMax(){
        return arr[0];
    }

//--------------------------------------------------------------------------REMOVE MAX VALUE-----------------------------------------------------------------    
    public int removeMax(){
int max=arr[0];
arr[0]=arr[size-1];
size=size-1;
maxHeapify(0);
return max;
    }
//----------------------------------------------------------------------------MAX HEAPIFY--------------------------------------------------------------------    
    public void maxHeapify(int index){
int l;
int r;
l=2*index+1;
r=2*index+2;

int largest=index;  
if(l<this.size &&arr[l]>arr[largest]){
    largest=l;
}
if(r<this.size &&arr[r]>arr[largest]){
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





