/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searchmethods;
import java.util.*;

/**
 *
 * @author Tania V
 */
public class BreadthFirstSearch {
     int[][] arr;

//  public static int[][] arr = new int[][] {
//            {0,0,0,0,0,0,0,0,0},
//            {0,1,1,0,0,0,0,0,0},
//            {0,0,0,1,0,0,0,0,0},
//            {0,0,0,1,0,0,0,0,0},
//            {0,0,0,1,0,0,0,0,0},
//            {0,0,0,0,0,9,0,0,0},
//            {0,0,0,0,0,0,0,0,0},
//            {0,0,0,0,0,0,0,0,0},
//            {0,0,0,0,0,0,0,0,0},
//    };

  public static Queue<Puntos> q = new LinkedList<Puntos>();

 /*se ejecuta el algoritmo donde:
  si el nodo que encontramos es 9 retomarnos el punto y finalizamos el proceso 
  si no, buscamos lo sucesores de ese nodo, y los agregamos a la cola, hasta encontrar el correcto, teniendo en cuenta que no sean obstáculos o ya se hayan visitado
  */
   public  boolean libre(int x, int y) {
        return (x >= 0 && x < arr.length) && (y >= 0 && y < arr.length) && (arr[x][y] == 0 || arr[x][y] == 9);
    }

    public  Puntos caminoBFS(int x, int y,int[][]arr, int fil,int col) {
        arr = new int[fil][col]; 
        q.add(new Puntos(x,y, null));

        while(!q.isEmpty()) {
            Puntos p = q.remove();

            if (arr[p.x][p.y] == 9) {
                System.out.println("Salida encontrada");
                return p;
            }

            if(libre(p.x+1,p.y)) {
                arr[p.x][p.y] = 2;
                Puntos nextP = new Puntos(p.x+1,p.y, p);
                q.add(nextP);
            }

            if(libre(p.x-1,p.y)) {
                arr[p.x][p.y] = 2;
                Puntos nextP = new Puntos(p.x-1,p.y, p);
                q.add(nextP);
            }

            if(libre(p.x,p.y+1)) {
                arr[p.x][p.y] = 2;
                Puntos nextP = new Puntos(p.x,p.y+1, p);
                q.add(nextP);
            }

             if(libre(p.x,p.y-1)) {
                arr[p.x][p.y] = 2;
                Puntos nextP = new Puntos(p.x,p.y-1, p);
                q.add(nextP);
            }

        }
        return null;
    }
/*
    comprueba si hay un espacio libre o que encuentre el nodo final.
    comprueba si hay un obstáculo y que la búsqueda no exceda los límites de la matriz,
    */


   
/*********************************************************************************************/
    /************************************************************************************/
    
////    public static void main(String[] args) {
//
//        puntos p = caminoBFS(0,0);/*Le damos el punto de partida */
//
//        /*imprime la matriz con la búsqueda que realizo para encontrar el final, siendo 1 el espacio recorrido */
//         for (int i = 0; i < 9; i++) {
//            for (int j = 0; j < 9; j++) {
//                System.out.print(arr[i][j]);
//            }
//            System.out.println();
//        }
//        /*imprime las coordenadas del camino que tomo desde la partida hasta el final*/
//        while(p.getParent() != null) {
//            System.out.println(p);
//            p = p.getParent();
//        }
//
//    }

}

//public class BreadthFirstSearch {
//
//  public static int[][] arr = new int[][] {
//            {0,0,0,0,0,0,0,0,0},
//            {0,1,1,0,0,0,0,0,0},
//            {0,0,0,1,0,0,0,0,0},
//            {0,0,0,1,0,0,0,0,0},
//            {0,0,0,1,0,0,0,0,0},
//            {0,0,0,0,0,9,0,0,0},
//            {0,0,0,0,0,0,0,0,0},
//            {0,0,0,0,0,0,0,0,0},
//            {0,0,0,0,0,0,0,0,0},
//    };
///*crea los puntos/nodos padre de cada uno de los espacios que se han recorrido*/
//  private static class puntos {
//        int x;
//        int y;
//        puntos padre;
//
//        public puntos(int x, int y, puntos padre) {
//            this.x = x;
//            this.y = y;
//            this.padre = padre;
//        }
//
//        public puntos getParent() {
//            return this.padre;
//        }
//
//        public String toString() {
//            return "x = " + x + " y = " + y;
//        }
//  }
///*agrega los nodos/puntos a la pila para ejecutar el algoritmo bfs*/
//  public static Queue<puntos> q = new LinkedList<puntos>();
//
// /*se ejecuta el algoritmo donde:
//  si el nodo que encontramos es 9 retomarnos el punto y finalizamos el proceso 
//  si no, buscamos lo sucesores de ese nodo, y los agregamos a la cola, hasta encontrar el correcto, teniendo en cuenta que no sean obstáculos o ya se hayan visitado
//  */
//
//    public static puntos caminoBFS(int x, int y,int [][]arr) {
//
//        q.add(new puntos(x,y, null));
//
//        while(!q.isEmpty()) {
//            puntos p = q.remove();
//
//            if (arr[p.x][p.y] == 9) {
//                System.out.println("Salida encontrada");
//                return p;
//            }
//
//            if(libre(p.x+1,p.y)) {
//                arr[p.x][p.y] = 2;
//                puntos nextP = new puntos(p.x+1,p.y, p);
//                q.add(nextP);
//            }
//
//            if(libre(p.x-1,p.y)) {
//                arr[p.x][p.y] = 2;
//                puntos nextP = new puntos(p.x-1,p.y, p);
//                q.add(nextP);
//            }
//
//            if(libre(p.x,p.y+1)) {
//                arr[p.x][p.y] = 2;
//                puntos nextP = new puntos(p.x,p.y+1, p);
//                q.add(nextP);
//            }
//
//             if(libre(p.x,p.y-1)) {
//                arr[p.x][p.y] = 2;
//                puntos nextP = new puntos(p.x,p.y-1, p);
//                q.add(nextP);
//            }
//
//        }
//        return null;
//    }
///*
//    comprueba si hay un espacio libre o que encuentre el nodo final.
//    comprueba si hay un obstáculo y que la búsqueda no exceda los límites de la matriz,
//    */
//
//
//    public static boolean libre(int x, int y) {
//        if((x >= 0 && x < arr.length) && (y >= 0 && y < arr[x].length) && (arr[x][y] == 0 || arr[x][y] == 9)) {
//            return true;
//        }
//        return false;
//    }
///*********************************************************************************************/
//    /************************************************************************************/
//    
////    public static void main(String[] args) {
////
////        puntos p = caminoBFS(0,0);/*Le damos el punto de partida */
////
////        /*imprime la matriz con la búsqueda que realizo para encontrar el final, siendo 1 el espacio recorrido */
////         for (int i = 0; i < 9; i++) {
////            for (int j = 0; j < 9; j++) {
////                System.out.print(arr[i][j]);
////            }
////            System.out.println();
////        }
////        /*imprime las coordenadas del camino que tomo desde la partida hasta el final*/
////        while(p.getParent() != null) {
////            System.out.println(p);
////            p = p.getParent();
////        }
////
////    }
//
//}




