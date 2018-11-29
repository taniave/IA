/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searchmethods;

/**
 *
 * @author Tania V
 */
public class Puntos {
   
        int x;
        int y;
        Puntos padre;

        public Puntos(int x, int y, Puntos padre) {
            this.x = x;
            this.y = y;
            this.padre = padre;
        }

        public Puntos getParent() {
            return this.padre;
        }

        @Override
        public String toString() {
            return "x = " + x + " y = " + y;
        }
  } 
