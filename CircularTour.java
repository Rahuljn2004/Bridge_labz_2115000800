class CircularTour {
    static class PetrolPump {
        int petrol, distance;
        PetrolPump(int petrol, int distance) {
            this.petrol = petrol;
            this.distance = distance;
        }
    }

    public static int findStartingPoint(PetrolPump[] pumps) {
        int totalDeficit = 0, balance = 0, start = 0;

        for (int i = 0; i < pumps.length; i++) {
            balance += pumps[i].petrol - pumps[i].distance;

            if (balance < 0) {
                totalDeficit += balance;
                start = i + 1;
                balance = 0;
            }
        }

        return (balance + totalDeficit >= 0) ? start : -1;
    }

    public static void main(String[] args) {
        PetrolPump[] pumps = { 
            new PetrolPump(4, 6), new PetrolPump(6, 5),
           new PetrolPump(7, 3), new PetrolPump(4, 5) 
        };
        int start = findStartingPoint(pumps);
        System.out.println(start); 
    }
}
