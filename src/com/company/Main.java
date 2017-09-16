package com.company;

import java.util.Random;

public class Main {

    private static void ArrInit(int n,int[] arr,boolean[] arrBool)
    {
      for(int i=1;i<=n;i++)
      {
          arr[i-1]=i;
          arrBool[i-1]=true;
      }
    }

    private static void PrintArray(int[] arr,boolean[] arrBool)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i=0;i<arrBool.length;i++)
        {
            if(arrBool[i]==true)
            {
                System.out.print("<- ");
            }
            else
            {
                System.out.print("->");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
	Random r=new Random();
	int n=r.nextInt(10);
	int[] arr=new int[n];
	boolean[] directions=new boolean[n];
	ArrInit(n,arr,directions);
	int k=1;
	while(true) {
        PrintArray(arr, directions);
        int index=-1;
        for(int i=0;i<arr.length;i++) {
            if((i!=0&&directions[i]==true&&arr[i]>arr[i-1])&&((index==-1)||(arr[i]>arr[index])))
            {
                index=i;
            }
            if ((i != arr.length - 1 && directions[i] == false && arr[i] > arr[i + 1]) && (index == -1 || arr[i] > arr[index])) {
                index = i;
            }

        }
        if(index==-1)
        {
            break;
        }

        int tmp=0;
        boolean tmpbool=false;
        if(directions[index]==true)
        {
            tmp=arr[index];
            tmpbool=directions[index];
            arr[index]=arr[index-1];
            directions[index]=directions[index-1];
            arr[index-1]=tmp;
            directions[index-1]=tmpbool;
            index=index-1;
        }
        else
        {
            tmp=arr[index];
            tmpbool=directions[index];
            arr[index]=arr[index+1];
            directions[index]=directions[index+1];
            arr[index+1]=tmp;
            directions[index+1]=tmpbool;
            index=index+1;
        }
            for(int i=0;i<arr.length;i++)
            {
                if(arr[i]>arr[index])
                {
                    if(directions[i]==true)
                    {
                        directions[i]=false;
                    }
                    else
                    {
                        directions[i]=true;
                    }
                }
            }

           k++;
        }
System.out.println(k);
    }
    }

