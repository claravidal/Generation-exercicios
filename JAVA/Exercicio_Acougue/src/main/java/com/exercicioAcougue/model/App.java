package com.exercicioAcougue.model;

import com.exercicioAcougue.servicoVenda.ServiceImpl;

public class App 
{
    public static void main( String[] args )
    {
     ServiceImpl serv = new ServiceImpl (); 
     
     serv.addCarne(new Carne("Maminha", 15 , 12.00));
     serv.getAllCarne();
    }
}
