/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Administraciones;

import java.util.HashSet;

/**
 *
 * @author Student
 */
public class ListaAdministracion {
    private HashSet<Ticket> tickets;
    
    public void agregarTicket(Ticket ticket){
        tickets.add(ticket);
    }

    public HashSet<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(HashSet<Ticket> tickets) {
        this.tickets = tickets;
    }

    public ListaAdministracion() {
        tickets = new HashSet<>();
    }
    
}
