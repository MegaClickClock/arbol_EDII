package com.mycompany.arbol;

import javax.swing.JApplet;
import javax.swing.JTextArea;

public class Arbol {

    private Nodo raiz;

    public Arbol() {
        raiz = null;
    }

    private boolean esHoja(Nodo pr) {
        return pr.getHI() == null && pr.getHD() == null;
    }

    public void insertar(int x) {
        Nodo q = new Nodo(x);
        if (raiz == null) {
            raiz = q;
            return;
        }
        Nodo p = raiz;
        Nodo ap = null;
        while (p != null) {
            ap = p;
            if (x < p.getElem()) {
                p = p.getHI();
            } else if (x > p.getElem()) {
                p = p.getHD();
            } else {
                return;
            }
        }
        if (x < ap.getElem()) {
            ap.setHI(q);
        } else {
            ap.setHD(q);
        }
    }

    private void preOrden(Nodo pr, JTextArea ta) {
        if (pr != null) {
            ta.append(String.valueOf(pr.getElem()) + " ");
            preOrden(pr.getHI(), ta);
            preOrden(pr.getHD(), ta);
        }
    }

    public void preOrden(JTextArea ta) {
        preOrden(raiz, ta);
    }

    private void inOrden(Nodo pr, JTextArea ta) {
        if (pr != null) {
            inOrden(pr.getHI(), ta);
            ta.append(String.valueOf(pr.getElem()) + " ");
            inOrden(pr.getHD(), ta);
        }
    }

    public void inOrden(JTextArea ta) {
        inOrden(raiz, ta);
    }

    private void postOrden(Nodo pr, JTextArea ta) {
        if (pr != null) {
            postOrden(pr.getHI(), ta);
            postOrden(pr.getHD(), ta);
            ta.append(String.valueOf(pr.getElem()) + " ");
        }
    }

    public void postOrden(JTextArea ta) {
        postOrden(raiz, ta);
    }

// metodos de la clase arbol
    private int cantidad(Nodo pr) {
        if (pr == null) {
            return 0;
        } else if (esHoja(pr)) {
            return 1;
        } else {
            int ai = cantidad(pr.getHI());
            int ad = cantidad(pr.getHD());
            return ai + ad + 1;
        }
    }

    public int cantidad() {
        return cantidad(raiz);
    }

    private int sumar(Nodo pr) {
        if (pr == null) {
            return 0;
        } else if (esHoja(pr)) {
            return pr.getElem();
        } else {
            int s1 = sumar(pr.getHI());
            int s2 = sumar(pr.getHD());
            return s1 + s2 + pr.getElem();
        }
    }

    public int sumar() {
        return sumar(raiz);
    }

    private int sumarPares(Nodo pr) {
        if (pr == null) { // caso base
            return 0;
        } else if (esHoja(pr)) {
            if (pr.getElem() % 2 == 0) {
                return pr.getElem();
            } else {
                return 0;
            }
        } else {
            int s1 = sumarPares(pr.getHI());
            int s2 = sumarPares(pr.getHD());
            if (pr.getElem() % 2 == 0) {
                return s1 + s2 + pr.getElem();
            } else {
                return s1 + s2;
            }
        }
    }

    public int sumarPares() {
        return sumarPares(raiz);
    }

    private int cantidadPares(Nodo pr) {
        if (pr == null) { // caso base
            return 0;
        } else if (esHoja(pr)) {
            if (pr.getElem() % 2 == 0) {
                return 1;
            } else {
                return 0;
            }
        } else {
            int s1 = cantidadPares(pr.getHI());
            int s2 = cantidadPares(pr.getHD());
            if (pr.getElem() % 2 == 0) {
                return s1 + s2 + 1;
            } else {
                return s1 + s2;
            }
        }
    }

    public int cantdiadPares() {
        return cantidadPares(raiz);
    }

    private void mostrarPares(Nodo pr, JTextArea ta) {
        if (pr == null) {//caso base
            return;
        } else if (esHoja(pr)) {
            if (pr.getElem() % 2 == 0) {
                ta.append(String.valueOf(pr.getElem()) + " ");
            }
        } else {
            mostrarPares(pr.getHI(), ta);
            mostrarPares(pr.getHD(), ta);
            if (pr.getElem() % 2 == 0) {
                ta.append(String.valueOf(pr.getElem()) + " ");
            }
        }
    }

    public void mostrarPares(JTextArea ta) {
        mostrarPares(raiz, ta);
    }

    private void mostrarPadres(Nodo pr, JTextArea ta) {
        if (pr == null) { //caso base
            return;
        } else {
            mostrarPadres(pr.getHI(), ta);
            mostrarPadres(pr.getHD(), ta);
            if (pr.getHI() != null || pr.getHD() != null) {
                ta.append(String.valueOf(pr.getElem()) + " ");
            }
        }
    }

    public void mostrarPadres(JTextArea ta) {
        mostrarPadres(raiz, ta);
    }

    private int altura(Nodo pr) {
        if (pr == null) {
            return 0;
        } else if (esHoja(pr)) {
            return 1;
        } else {
            int ai = altura(pr.getHI());
            int ad = altura(pr.getHD());
            if (ai > ad) {
                return ai + 1;
            } else {
                return ad + 1;
            }
        }
    }

    public int altura() {
        return altura(raiz);
    }

    private boolean existe(Nodo pr, int x) {
        if (pr == null) {
            return false;
        } else if (esHoja(pr)) {
            return pr.getElem() == x;
        } else {
            boolean ai = existe(pr.getHI(), x);
            boolean ad = existe(pr.getHD(), x);
            if (ai || ad) {
                return true;
            } else {
                return pr.getElem() == x;
            }
        }
    }

    public boolean existe(int x) {
        return existe(raiz, x);
    }

    private void mayoresX(Nodo pr, JTextArea ta, int x) {
        if (pr == null) {
            return;
        } else if (esHoja(pr) && pr.getElem() > x) {
            ta.append(String.valueOf(pr.getElem()) + " ");
        } else {
            mayoresX(pr.getHI(), ta, x);
            mayoresX(pr.getHD(), ta, x);
            if (pr.getElem() > x) {
                ta.append(String.valueOf(pr.getElem()) + " ");
            }
        }
    }

    public void mayoresX(JTextArea ta, int x) {
        mayoresX(raiz, ta, x);
    }

    private boolean esHijo(Nodo pr, int hijo) {
        if (pr == null) {
            return false;
        }
        if (!esHoja(pr)) {
            if (pr.getHI() != null && pr.getHI().getElem() == hijo) {
                return true;
            }
            if (pr.getHD() != null && pr.getHD().getElem() == hijo) {
                return true;
            }
        }
        return false;
    }

    private int devolverAbuelo(Nodo pr, int x) {
        if (pr == null) {
            return 0;
        }
        if (altura(pr) >= 3) {
            if (pr.getHI() != null && esHijo(pr.getHI(), x)) {
                return pr.getElem();
            }
            if (pr.getHD() != null && esHijo(pr.getHD(), x)) {
                return pr.getElem();
            }
        }
        int ai = devolverAbuelo(pr.getHI(), x);
        int ad = devolverAbuelo(pr.getHD(), x);
        if (ai != 0) {
            return ai;
        } else if (ad != 0) {
            return ad;
        } else {
            return 0;
        }
    }

    public int devolverAbuelo(int x) {
        return devolverAbuelo(raiz, x);
    }

    private int devolverPadre(Nodo pr, int x) {
        if (pr == null) {
            return 0;
        }
        if (altura(pr) >= 2) {
            if (pr.getHI() != null && esHijo(pr, x)) {
                return pr.getElem();
            }
            if (pr.getHD() != null && esHijo(pr, x)) {
                return pr.getElem();
            }
        }
        int ai = devolverPadre(pr.getHI(), x);
        int ad = devolverPadre(pr.getHD(), x);
        if (ai != 0) {
            return ai;
        } else if (ad != 0) {
            return ad;
        } else {
            return 0;
        }
    }

    public int devolverPadre(int x) {
        return devolverPadre(raiz, x);
    }

    private void mostrarNietos(Nodo pr, int x, JTextArea ta) {
        if (pr == null) {
            return;
        } else {
            if (pr.getElem() == x) {
                if (pr.getHD() != null) {
                    if (pr.getHD().getHI() != null) {
                        ta.append(pr.getHD().getHI().getElem() + " ");
                    }
                    if (pr.getHD().getHD() != null) {
                        ta.append(pr.getHD().getHD().getElem() + " ");
                    }
                }
                if (pr.getHI() != null) {
                    if (pr.getHI().getHD() != null) {
                        ta.append(pr.getHI().getHD().getElem() + " ");
                    }
                    if (pr.getHI().getHI() != null) {
                        ta.append(pr.getHI().getHI().getElem() + " ");
                    }
                }
            }//end if
            if (x > pr.getElem()) {
                mostrarNietos(pr.getHD(), x, ta);
            } else {
                mostrarNietos(pr.getHI(), x, ta);
            }
        }
    }

    public void mostrarNietos(int x, JTextArea ta) {
        mostrarNietos(raiz, x, ta);
    }

    private boolean iguales(Nodo pa, Nodo pb) {
        if (pa == null && pb == null) {
            return true;
        }
        if (pa == null && pb != null || pb == null && pa != null) {
            return false;
        }
        if (esHoja(pa) && esHoja(pb)) {
            return pa.getElem() == pb.getElem();
        }

        boolean ai = iguales(pa.getHI(), pb.getHI());
        boolean ad = iguales(pa.getHD(), pb.getHD());
        if (ai && ad) {
            return true;
        } else {
            return false;
        }
    }

    public boolean iguales(Arbol B) {
        return iguales(this.raiz, B.raiz);
    }

    private int factorEquilibrio(Nodo pr) {
        if (pr == null) {
            return 0;
        } else {
            return (altura(pr.getHI()) - altura(pr.getHD()));
        }
    }

    public int factorEquilibrio(int x) {
        Nodo p = this.raiz;
        while (p != null && p.getElem() != x) {//buscar el nodo
            if (x > p.getElem()) {
                p = p.getHD();
            } else {
                p = p.getHI();
            }
        }
        return factorEquilibrio(p);
    }

    private void elimCaso1(Nodo ap, Nodo p) {
        if (ap == null) {
            this.raiz = null;
        } else {
            if (p == ap.getHD()) {
                ap.setHD(null);
            } else {
                ap.setHI(null);
            }
        }
    }

    private void elimCaso2(Nodo ap, Nodo p) {
        if (ap == null) {
            if (p.getHD() != null) {
                this.raiz = ap.getHD();
            } else {
                this.raiz = p.getHI();
            }
        } else {
            if (p == ap.getHD()) {
                if (p.getHI() != null) {
                    ap.setHD(p.getHD());
                } else {
                    ap.setHD(p.getHI());
                }
            } else {
                if (p.getHD() != null) {
                    ap.setHD(p.getHD());
                } else {
                    ap.setHI(p.getHD());
                }
            }
        }

    }

    private void elimCaso3(Nodo p) {
        Nodo s = p.getHD();
        Nodo as = null;
        while (s.getHI() != null) {
            as = s;
            s = s.getHI();
        }
        int aux = p.getElem();
        p.setElem(s.getElem());
        s.setElem(aux);
        if (as == null) {
            p.setHD(null);
        } else {
            as.setHI(null);
        }
    }

    public void eliminar(int x) {
        Nodo p = raiz;
        Nodo ap = null;
        while (p != null && p.getElem() != x) {
            ap = p;
            if (x > p.getElem()) {
                p = p.getHD();
            } else {
                p = p.getHI();
            }
        }
        if (p == null) {
            return;
        }
        if (esHoja(p)) {
            elimCaso1(ap, p);
        } else {
            if ((p.getHD() != null && p.getHI() == null) || (p.getHD() == null && p.getHI() != null)) {
                elimCaso2(ap, p);
            } else {
                elimCaso3(p);
            }
        }
    }

    private boolean compararSubarbol(Nodo pa, Nodo pb) {
        if (pa == null) {
            return false;
        }
        if (pa.getElem() == pb.getElem()) {
            return iguales(pa, pb);
        }
        return (pb.getElem() > pa.getElem()) ? compararSubarbol(pa.getHD(), pb) : compararSubarbol(pa.getHI(), pb);
    }

    public boolean compararSubarbol(Arbol B) {
        return compararSubarbol(this.raiz, B.raiz);
    }
    
    private int seriePar(int i, int x, int s, JTextArea ta){
        if (i<= x) {
            ta.append(String.valueOf(i) + " ");
            s = s + seriePar(i+2, x, i, ta);
        }
        return s;
    }
    
    public int seriePar(int x,JTextArea ta){
        return seriePar(0, x, 0, ta);
    }
    
    private int sumarElementAltura (Nodo p, int x){
        return 0;
    }
}//end class
