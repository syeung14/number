package numbercruncher.matrix;

public class RowVector extends Matrix
{
    //--------------//
    // Constructors //
    //--------------//

    /**
     * Constructor.
     * @param n the number of elements
     */
    public RowVector(int n) { super(1, n); }

    /**
     * Constructor.
     * @param values the array of values
     */
    public RowVector(float values[]) { set(values); }

    /**
     * Constructor.
     * @param m the matrix (only the first row used)
     */
    private RowVector(Matrix m) { set(m); }

    //---------//
    // Getters //
    //---------//

    /**
     * Return the row vector's size.
     */
    public int size() { return nCols; }

    /**
     * Copy the values of this matrix.
     * @return the copied values
     */
    public float[] copyValues1D()
    {
        float v[] = new float[nCols];

        for (int c = 0; c < nCols; ++c) {
            v[c] = values[0][c];
        }

        return v;
    }

    /**
     * Return the i'th value of the vector.
     * @param i the index
     * @return the value
     */
    public float at(int i) { return values[0][i]; }

    //---------//
    // Setters //
    //---------//

    /**
     * Set this row vector from a matrix. Only the first row is used.
     * @param m the matrix
     */
    private void set(Matrix m)
    {
        this.nRows  = 1;
        this.nCols  = m.nCols;
        this.values = m.values;
    }

    /**
     * Set this row vector from an array of values.
     * @param values the array of values
     */
    protected void set(float values[])
    {
        this.nRows  = 1;
        this.nCols  = values.length;
        this.values = new float[1][];

        this.values[0] = values;
    }

    /**
     * Set the i'th value of the vector.
     * @param i the index
     * @param value the value
     */
    public void set(int i, float value) { values[0][i] = value; }

    //-------------------//
    // Vector operations //
    //-------------------//

    /**
     * Add another row vector to this row vector.
     * @param rv the other row vector
     * @return the sum row vector
     * @throws numbercruncher.MatrixException for invalid size
     */
    public RowVector add(RowVector rv) throws MatrixException
    {
        return new RowVector(super.add(rv));
    }

    /**
     * Subtract another row vector from this row vector.
     * @param rv the other row vector
     * @return the sum row vector
     * @throws numbercruncher.MatrixException for invalid size
     */
    public RowVector subtract(RowVector rv) throws MatrixException
    {
        return new RowVector(super.subtract(rv));
    }

    /**
     * Compute the Euclidean norm.
     * @return the norm
     */
    public float norm()
    {
        double t = 0;
        for (int c = 0; c < nCols; ++c) {
            float v = values[0][c];
            t += v*v;
        }

        return (float) Math.sqrt(t);
    }

    /**
     * Print the vector values.
     */
    public void print()
    {
        for (int c = 0; c < nCols; ++c) {
            System.out.print("  " + values[0][c]);
        }
        System.out.println();
    }
}