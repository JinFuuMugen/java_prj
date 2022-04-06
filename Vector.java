public class Vector {
    private  double x;
    private  double y;
    private  double z;

    public Vector (double x, double y, double z) {
        this.x=x;
        this.y=y;
        this.z=z;
    }
    public double getLength () {
        return Math.sqrt(x*x+y*y+z*z);
    }
    public double scalarProduct (Vector vector){
        return (x*vector.x+y*vector.y+z*vector.z);
    }
    public Vector vectorProduct (Vector vector){
        return new Vector (this.y*vector.z-this.z*vector.y, this.z*vector.x-this.x*vector.z, this.x*vector.y-this.y*vector.x);
    }
    public double getCos (Vector vector){
        return this.scalarProduct(vector)/(this.getLength()*vector.getLength());
    }
    public Vector add(Vector vector){
        return new Vector(this.x+vector.x, this.y+vector.y, this.z+vector.z);
    }
    public Vector sub(Vector vector){
        return new Vector(this.x-vector.x, this.y-vector.y, this.z-vector.z);
    }
    public static Vector[] generate (int n)
    {
        Vector[] vectors=new Vector[n];
        for (int i=0; i<n; i++){
            vectors[i] = new Vector (Math.random(), Math.random(), Math.random());
        }
        return vectors;
    }
    @Override 
    public String toString(){
        return "Vector{"+ "x="+x+", y="+y+", z="+z+'}';
    }

    public static void main(String[] args) {
        Vector[] vectors=Vector.generate(10);
        System.out.println(vectors[0]);
        System.out.println(vectors[1]);
        System.out.println(vectors[0].getLength());
        System.out.println(vectors[0].scalarProduct(vectors[1]));
        System.out.println(vectors[0].vectorProduct(vectors[1]));
        System.out.println(vectors[0].getCos(vectors[1]));
        System.out.println(vectors[0].add(vectors[1]));
        System.out.println(vectors[0].sub(vectors[1]));
       
    }
}
