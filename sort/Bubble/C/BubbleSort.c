#include<stdio.h>


static int * bubbleSort(int*, int);
static void executeAndPrint(int*, int);
static void printArray(int*, int);

int main(){
    int arrayLength = 8;
    int sortingArray[8] = {999,82,73,2,442,6,1,77};
    executeAndPrint(sortingArray, arrayLength);
    return(0);
}

static int * bubbleSort(int *array, int length){
    int i, j, tmp;

    for(i = 0; i < length; i++){
        for(j = 0; j < length - 1; j++){
            if(array[j] > array[j + 1]){
                tmp = array[j];
                array[j] = array[j + 1];
                array[j + 1] = tmp;
            }
        }
    }
    return array;
}

static void executeAndPrint(int *array, int length){
    printf("Array before bubble sort: \n");
    printArray(array, length);
    printf("Array after bubble sort: \n");
    printArray(bubbleSort(array, length), length);

}

static void printArray(int *array, int length){
    int i;
    for(i = 0;i < length; i++){
        printf("%i ", array[i]);
    }
    printf("\n");
}