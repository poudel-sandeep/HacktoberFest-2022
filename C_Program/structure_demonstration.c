#include <stdio.h>
#include <string.h>

void main()
{
// Structure Created
    struct employee{
        char name[20], code[10], phone[10];
        float salary;
    };
    // Structure Variable Created
    struct employee emp[10];
    int num, i;
    float max_salary;
    // Asking User to enter data
    printf("Enter the number of employees : ");
    scanf("%d", &num);
    for(i=0; i<num; i++){
        printf("\n Enter details for employee : %d =>", i+1);
        scanf("%s%s%f%s", emp[i].name, emp[i].code, &emp[i].salary, emp[i].phone );
    }
    // Comparing first salary of an array with rest salary of an array.
    // And if max_salary is less than other compared salary, then put highest of an array.
    max_salary = emp[0].salary;
    for(i=0; i<num; i++){
        if(max_salary < emp[i].salary){
            max_salary = emp[i].salary;
        }
    }
    // Printing out the details of employee whose salary is highest among all.
    for(i=0; i<num; i++){
        if(max_salary == emp[i].salary){
            printf("\n Name : %s \n Code : %s \n Salary : %f \n Phone : %s", emp[i].name, emp[i].code, emp[i].salary, emp[i].phone );
        }
    }
}
