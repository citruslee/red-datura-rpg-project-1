/*
	Martin Losak
	PPINFO 07
	18.10.2011
*/

#include<stdio.h>
void nacitaj(double *a,double *b)
{
	printf("Zadajte strany A a B: \n");
	scanf("%lf %lf",a,b);
}

double obvod(double a, double b) 
{
   return 2 * (a + b);
}

double obsah(double a, double b) 
{
   return a * b;
}

int main() 
{
   double a,b,o,s;

   nacitaj(&a,&b);
   o=obvod(a,b);
   s=obsah(a,b);
   getchar();
   switch(getchar())
   {
      case 'o' : printf("obvod: %.3f\n",o);break;
      case 's' : printf("obsah: %.3f\n",s);break;
   }
   
   getchar();
   getchar();
   return 0;

}
