class Volume_Of_Earth {
    public static void main(String[] args) {
        double radiusKm = 6378;
        double volumeKm3 = (4 / 3.0) * Math.PI * Math.pow(radiusKm, 3);
        double volumeMiles3 = volumeKm3 / Math.pow(1.609, 3);
        System.out.println("The volume of earth in cubic kilometers is " + volumeKm3 + " and cubic miles is " + volumeMiles3);
    }
}
