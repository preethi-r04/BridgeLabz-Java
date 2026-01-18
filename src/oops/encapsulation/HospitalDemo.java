package oops.encapsulation;
interface MedicalRecord {
    void addRecord(String record);
}

abstract class Patient {
    private int patientId;
    protected String name;

    Patient(int id, String name) {
        patientId = id;
        this.name = name;
    }

    abstract double calculateBill();
}

class InPatient extends Patient {
    InPatient(int id, String name) {
        super(id, name);
    }

    double calculateBill() {
        return 10000;
    }
}
