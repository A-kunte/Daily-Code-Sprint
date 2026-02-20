// Layer 1: Grandparent
class Device {
    void powerOn() {
        System.out.println("🔌 Device is starting up...");
    }
}

// Layer 2: Parent (Inherits from Device)
class Smartphone extends Device {
    void connectToNetwork() {
        System.out.println("📶 Searching for 5G network...");
    }
}

// Layer 3: Child (Inherits from Smartphone)
class IPhone extends Smartphone {
    void useFaceID() {
        System.out.println("🎭 Scanning face for security...");
    }

    // Advanced Logic: Overriding from Grandparent
    @Override
    void powerOn() {
        super.powerOn(); // Call Grandparent logic
        System.out.println("🍎 Apple logo appears on screen.");
    }
}

public class MultilevelSystem {
    public static void main(String[] args) {
        IPhone myPhone = new IPhone();

        // Calling methods from all 3 layers
        myPhone.powerOn(); // Level 3 (and 1)
        myPhone.connectToNetwork(); // Level 2
        myPhone.useFaceID(); // Level 3
    }
}