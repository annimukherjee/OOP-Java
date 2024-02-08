class Calculator {

    float area(float rad) {
        return (float) (Math.PI * rad * rad);
    }

    float area(double len) {
        return (float) (len * len);
    }

    float area(float base, float height) {
        return (float) (0.5 * base * height);
    }

}