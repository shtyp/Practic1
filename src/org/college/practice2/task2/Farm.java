package org.college.practice2.task2;

class Farm {
    private String name;
    private String location;
    private int numberOfAnimals;
    private String cropType;
    private double totalArea;
    private double annualIncome;


    private Farm(FarmBuilder builder) {
        this.name = builder.name;
        this.location = builder.location;
        this.numberOfAnimals = builder.numberOfAnimals;
        this.cropType = builder.cropType;
        this.totalArea = builder.totalArea;
        this.annualIncome = builder.annualIncome;
    }

    @Override
    public String toString() {
        return "Farm{" +
                "name='" + name + '}' +
                ", location='" + location + '}' +
                ", numberOfAnimals=" + numberOfAnimals +
                ", cropType='" + cropType + '}' +
                ", totalArea=" + totalArea +
                ", annualIncome=" + annualIncome +
                '}';
    }


    static class FarmBuilder {
        private String name;
        private String location;
        private int numberOfAnimals;
        private String cropType;
        private double totalArea;
        private double annualIncome;

        public FarmBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public FarmBuilder setLocation(String location) {
            this.location = location;
            return this;
        }

        public FarmBuilder setNumberOfAnimals(int numberOfAnimals) {
            this.numberOfAnimals = numberOfAnimals;
            return this;
        }

        public FarmBuilder setCropType(String cropType) {
            this.cropType = cropType;
            return this;
        }

        public FarmBuilder setTotalArea(double totalArea) {
            this.totalArea = totalArea;
            return this;
        }

        public FarmBuilder setAnnualIncome(double annualIncome) {
            this.annualIncome = annualIncome;
            return this;
        }

        public Farm build() {
            return new Farm(this);
        }
    }
}

