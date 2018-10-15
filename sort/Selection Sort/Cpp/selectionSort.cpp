#include <iostream>

using namespace std;


// Function for performing Selection Sort

void SSort(int arr[], int N){ 
    int sm,i,j,temp;
    for(i = 0 ;i<N-1 ;i++) {
        sm = i;
        for(j = i+1; j<N ; j++){
            if(arr[j] < arr[sm])
                sm = j;
        }
        if(i != sm){
            temp = arr[sm] ;
            arr[sm] = arr[i] ;
            arr[i] = temp;
        }
    }
}


