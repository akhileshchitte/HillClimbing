public class Heuristic {

    private int heuristic;
    private int nullValue;
    private int[] x1;
    private int[] x2;
    private int[] x3;

    private int[] y1;
    private int[] y2;
    private int[] y3;

    private int[] z1;
    private int[] z2;
    private int[] z3;

    public Heuristic() {
        this.heuristic = heuristic;
        this.nullValue = nullValue;
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        this.y1 = y1;
        this.y2 = y2;
        this.y3 = y3;
        this.z1 = z1;
        this.z2 = z2;
        this.z3 = z3;
        this.o1 = o1;
        this.o2 = o2;
        this.o3 = o3;
    }

    private int[] o1;
    private int[] o2;
    private int[] o3;




    //Starting
    private int[] a =  {1,2,4};
    private int[] b = {5,0,7};
    private int[] c = {3,6,8};

    //Goal
    private int[] p = {1,4,7};
    private int[] q =  {2,5,8};
    private int[] r = {3,6,0};




    //-------------------------
    public void a0(){


    }

    public void a1(){

    }

    public void a2(){

    }

    //--------------------------

    public void b0(){


    }

    public void b1(){
        for(int i = 0; i<4; i++){
            switch (i){
                case 0:
                    int [] x = new int[3];
                     x[1] = this.b[0];
                     x[0] = this.b[1];
                     x[2] = this.b[2];
                    x1 = this.a;
                    x2 = x;
                    x3 = this.c;
                break;

                case 1:
                    int [] y = new int[3];
                    y[0] = this.b[0];
                    y[2] = this.b[1];
                    y[1] = this.b[2];
                    y1 = this.a;
                    y2 = y;
                    y3 = this.c;
                    break;
                case 2:
                    int [] z = new int[3];
                    int [] zs = new int[3];
                     z[0] = this.b[0];
                     z[1] = this.a[1];
                     z[2] =  this.b[2];
                     zs[0] = this.a[0];
                     zs[1] = this.b[1];
                     zs[2] = this.a[2];
                     z1 = zs;
                     z2 = z;
                     z3 = this.c;
                     break;
                case 3:
                    int [] o = new int[3];
                    int [] os = new int[3];
                    o[0] = this.b[0];
                    o[1] = this.c[1];
                    o[2] =  this.b[2];
                    os[0] = this.c[0];
                    os[1] = this.b[1];
                    os[2] = this.c[2];
                    o1 = this.a;
                    o2 = o;
                    o3 = os;
                    break;
                default:
                    break;
            }
        }

        System.out.println("the value is: "+ o2[1]);

    }

    public void b2(){

        System.out.println("this is called");

    }

    //--------------------------

    public void c0(){

    }
    public void c1(){

    }
    public void c2(){

    }



    public void findHeuristic(){



    }




    public void checkNullValue(){

        for(int i = 0; i<3; i++){
            switch (i){
                case 0 :
                    for(int a = 0; a<3; a++){
                    int val = this.a[a];
                    if (val == 0){
                        System.out.println("a: "+a);
                        if(a==0){
                            a0();
                        }else if(a==1){
                            a1();
                        }else {
                            a2();
                        }
                    }
                }
                break;
                case 1:
                    for(int a = 0; a<3; a++){
                        int val = this.b[a];
                        if (val == 0){
                            System.out.println("b: "+a);
                            if(a==0){
                                b0();
                            }else if(a==1){
                                b1();
                            }else {
                                b2();
                            }
                        }
                    }
                    break;
                case 2:
                    for(int a = 0; a<3; a++){
                        int val = this.c[a];
                        if (val == 0){
                            System.out.println("c: "+a);
                            if(a==0){
                                b0();
                            }else if(a==1){
                                b1();
                            }else {
                                b2();
                            }
                        }
                    }
                    break;
                default:
                    break;
            }
        }

    }


    public void init(){

        System.out.println("\nHill Climbing Starting State");
        System.out.println(" _____________");
        System.out.println(" | "+this.a[0]+" | "+this.a[1]+" | "+this.a[2]+" | ");
        System.out.println(" | "+this.b[0]+" | "+this.b[1]+" | "+this.b[2]+" | ");
        System.out.println(" | "+this.c[0]+" | "+this.c[1]+" | "+this.c[2]+" | ");
        System.out.println(" -------------");

        System.out.println("\nHill Climbing Goal State");
        System.out.println(" _____________");
        System.out.println(" | "+this.p[0]+" | "+this.p[1]+" | "+this.p[2]+" | ");
        System.out.println(" | "+this.q[0]+" | "+this.q[1]+" | "+this.q[2]+" | ");
        System.out.println(" | "+this.r[0]+" | "+this.r[1]+" | "+this.r[2]+" | ");
        System.out.println(" -------------");

        checkNullValue();



    }



}
