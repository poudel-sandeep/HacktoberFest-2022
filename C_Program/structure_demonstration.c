#include <stdio.h>
#include <string.h>

void main()
{
    struct employee{
        char name[20];
        char code[10];
        float salary;
        char phone[10];
    };
    struct employee emp[10];
    int num, i;
    float max_salary;
    printf("Enter the number of employees : ");
    scanf("%d", &num);
    for(i=0; i<num; i++){
        printf("\n Enter details for employee : %d =>", i+1);
        scanf("%s%s%f%s", emp[i].name, emp[i].code, &emp[i].salary, emp[i].phone );
    }
    max_salary = emp[0].salary;
    for(i=0; i<num; i++){
        if(max_salary < emp[i].salary){
            max_salary = emp[i].salary;
        }
    }
    for(i=0; i<num; i++){
        if(max_salary == emp[i].salary){
            printf("\n Name : %s \n Code : %s \n Salary : %f \n Phone : %s", emp[i].name, emp[i].code, emp[i].salary, emp[i].phone );
        }
    }
}
