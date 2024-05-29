class TTE {
  public static long[][] ttexp(int rows_, int cols_, int exp_) {
    long [][] thing = new long[rows_][cols_];
    for (int rows = 0; rows < rows_; rows++) {
      for (int cols = 0; cols < cols_; cols++) {
        thing[rows][cols] = (long)Math.pow((cols + rows * cols_) + 1, exp_);
      }
    }
    return thing;
  }
}
