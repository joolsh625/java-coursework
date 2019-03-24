public enum Sauce {

    TOMATO(0.00){
        public String toString() {
            return "Tomato Sauce";
        }
    },
    PESTO(0.50){
        public String toString() {
            return "Pesto Sauce";
        }
    };

    private double cost;

    Sauce(double cost) {
        this.cost = cost;
    }

    public double getCost() {
        return this.cost;
    }

    public String getCostAsString() {
        return String.valueOf(cost);
    }

}
