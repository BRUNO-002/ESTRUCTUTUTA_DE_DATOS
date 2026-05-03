/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ed0005;
import dao.Lista;
import dto.Nodo;
class ED0005 {
    public static void main(String[] args) {
        Lista l=new Lista();
        l.agregar(new Nodo(3, null));
        l.agregar(new Nodo(5, null));
        l.agregar(new Nodo(7, null));
        l.agregar(new Nodo(9, null));
        l.leer();
    }
}
