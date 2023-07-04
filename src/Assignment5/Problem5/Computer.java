package Assignment5.Problem5;

import java.util.Objects;

public class Computer {
    String manufacturer;
    String processor;
    int ramSize;
    double processorSpeed;
    Computer(String manufacturer, String processor, int ramSize, double processorSpeed) {
        this.manufacturer = manufacturer;
        this.processor = processor;
        this.ramSize = ramSize;
        this.processorSpeed = processorSpeed;
    }

    public int getRamSize() {
        return ramSize;
    }
    public double getProcessorSpeed() {
        return processorSpeed;
    }
    public double computePower() {
        return ramSize * processorSpeed;
    }

    @Override
    public String toString() {
        return "Computer power: " + computePower() + "\nManufacturer: " + manufacturer +
                "\nProcessor: " + processor + "\nProcessorSpeed: " + processorSpeed + "\nRam Size: " + ramSize;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Computer comp = (Computer) obj;

        /*this.manufacturer.equals(((Computer) obj).manufacturer) &&
               this.processor.equals(((Computer) obj).manufacturer) &&
               this.ramSize == ((Computer) obj).ramSize && this.processorSpeed == ((Computer) obj).processorSpeed;*/
        return Objects.equals(manufacturer, ((Computer)obj).manufacturer) &&
                Objects.equals(processor, ((Computer) obj).processor) &&
                this.ramSize == ((Computer) obj).ramSize && this.processorSpeed == ((Computer) obj).processorSpeed;
    }
    @Override
    public int hashCode() {
        return Objects.hash(manufacturer, processor, ramSize, processorSpeed);
    }
}
