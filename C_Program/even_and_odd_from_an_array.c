// Enter n number and seperate odd and even elements of an array

#include <stdio.h>

void main()
{
    int arr[100], i, n;
    
    // Taking input from user
    printf("Enter the number of terms : ");
    scanf("%d", &n);
    printf("Enter %d numbers : ", n);
    for(i=0; i<n; i++){
        scanf("%d", &arr[i]);
    }
    
    // Even munbers only
    printf("\n Even Numbers : ");
    for(i=0; i<n; i++){
        if(arr[i]%2==0){
            printf("%d,  ",arr[i] );
        }
    }
    
     // Odd munbers only
    printf("\n Odd Numbers : ");
    for(i=0; i<n; i++){
        if(arr[i]%2==1){
            printf("%d,  ",arr[i] );
        }
    }
}
