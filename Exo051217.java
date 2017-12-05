import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by touit on 05/12/2017.
 *
 Ex.1
 En utilisant la classe ArrayList, créez un programme qui:
 1. reçoit 20 valeurs numériques réelles de l'utilisateur.
 2. calcule le nombre de valeurs qui sont supérieures à la moyenne.

 Ex.2

 Ecrire un programme ou l’utilisateur va donner  10 mots et sauvegarder les mots dans une ArrayList.
 ·         D'abord afficher tous les mots.
 ·         Puis affichez-les dans l'ordre inverse.
 Ecrire une méthode inverseWord qui inverse l'ordre des éléments dans une ArrayList de String.
 ·         Puis affichez-les avec tous les pluriels (se terminant par "s") en majuscule.
 Ecrire une méthode capitalizePlurals qui accepte une ArrayList de String et remplace chaque mot qui se termine par un "s" avec sa version en majuscule.

 Ex.3

 Ecrire un programme ou l’utilisateur va donner  10 chiffres et affiche tous les numéros sous forme de liste (sauvegarder dans une ArrayList), puis:
 ·         Imprime la moyenne des nombres.
 ·         Imprime le nombre le plus élevé et le plus bas.
 ·         Filtre tous les nombres pairs (divisibles par 2).

 Ex.4

 Ecrire une méthode intersection qui accepte deux Arraylists d'entiers comme arguments  et retourne une nouvelle liste qui contient seulement les éléments qui se trouvent dans les deux listes.
 Exemple: si les listes nommées list1 et list2 stockent initialement:
 [1, 4, 8, 9, 11, 15, 17, 28, 41, 59]addAll
 [4, 7, 11, 17, 19, 20, 23, 28, 37, 59, 81]
 Alors l'appel de intersect (list1, list2) dans le main retourne la liste:
 [4, 11, 17, 28, 59]

 */
public class Exo051217 {

    ArrayList<Integer> valNum = new ArrayList<>();

    ArrayList<Integer> val3 = new ArrayList<>();

    ArrayList<String> mots = new ArrayList<>();


    Scanner sc = new Scanner(System.in);

    public class Ex1{

        int som = 0;
        int moy = 0;

        public void metho1() {

            for (int i = 0; i < 20; i++) {

                valNum.add(i, sc.nextInt());
                som = valNum.get(i) + som;

            }
            moy = som/20;
            for( int j = 0; j < 20; j++){
               if(valNum.get(j) > moy)
                   System.out.println(" Cette valeur est au dessus de la moyenne : " + valNum.get(j));
            }
        }


    }

    public class Ex2{


        private ArrayList<String> inverseWord (ArrayList<String> str){
            ArrayList<String> ret = new ArrayList<>();
            for(int i = 0; i < str.size(); i++){
                ret.add(str.get(str.size()-i));
            }
            System.out.println(str.toString());
            return ret;
        }

        private ArrayList<String> capitalizePlurals(ArrayList<String> str) {
            ArrayList<String> ret = new ArrayList<>();
            for (int i = 0; i < str.size(); i++) {
                if (str.get(i).lastIndexOf('s') != -1){
                    str.get(i).toUpperCase();
                }
                System.out.println(str.get(i));
            }
            return str;
        }


        public void metho2(){
            System.out.println("Donnez 10 mots: ");
            for (int i = 0; i < 10; i++){
                mots.add(i, sc.next());
                System.out.println(mots.get(i));
                System.out.println(mots.get(10-i));
                inverseWord(mots);
                capitalizePlurals(mots);
            }

        }

    }

    public class Ex3{


        public void metho3(){
            int som = 0;
            int moy = 0;
            int min = 0;
            int max = 0;
            for(int i = 0; i < 10; i++){
                val3.add(sc.nextInt());
                som += val3.get(i);
                System.out.println(val3.get(i)+ " " + som);

            }
            for(int i = 0; i < 10; i++){
                if(i==0){
                    max = val3.get(i);
                    min = val3.get(i);
                }else if(val3.get(i) > max){
                    max = val3.get(i);
                }else if(val3.get(i) < min) {
                    min = val3.get(i);
                }
                System.out.println(min+ " " + max);
                if(val3.get(i)%2 == 0){
                System.out.println( val3.get(i) + " est un nbre pair");
                }

        }

        }


    }


    public class Ex4{

    ArrayList<Integer> ent1 = new ArrayList<>(Arrays.asList(1, 4, 8, 9, 11, 15, 17, 28, 41, 59));

    ArrayList<Integer> inter = new ArrayList<>(Arrays.asList(4, 7, 11, 17, 19, 20, 23, 28, 37, 59, 81));

    ArrayList<Integer> ent2 = new ArrayList<>();


    public ArrayList<Integer> intersection(ArrayList<Integer> a, ArrayList<Integer> b){


        for(int j = 0; j <ent1.size(); j++){

            for(int i = 0; i < ent2.size(); i++){
                if (ent2.get(i) == ent1.get(j)){
                    inter.add(ent1.get(i));
                }
            }

        }
        return inter;
    }





    }




    public static void main(String arg []){






    }
}
