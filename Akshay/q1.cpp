#include<iostream>
using namespace std;
int main(){
    int size;
    cout<<"Enter size of array: ";
    cin>>size;
    int arr[size];
    int num;
    cout<<"Enter the elements of array"<<endl;
    for(int i=0;i<size;i++){
        cin>>arr[i];
    }
    cout<<"Enter the sum you want: ";
    cin>>num;    
    cout<<"Required indices are: "<<endl;
    for(int i=0;i<size;i++){
         for (int j= 0; j <size; j++)
         {
            if((arr[i]-arr[j])==abs(num)){
                cout<<i<<" "<<j<<endl;
            }
         }
         
    }
    return 0;
}