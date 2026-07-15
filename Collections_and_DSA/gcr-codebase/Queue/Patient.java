import java.util.PriorityQueue;

class Patient {

    int priority;
    String name;

    Patient(int priority, String name) {
        this.priority = priority;
        this.name = name;
    }
}

public class HospitalER {

    private PriorityQueue<Patient> triageQueue =
            new PriorityQueue<>((a, b) -> a.priority - b.priority);

    public void admitPatient(Patient patient) {
        triageQueue.offer(patient);
    }

    public Patient callNextPatient() {
        return triageQueue.poll();
    }

    public static void main(String[] args) {

        HospitalER hospital = new HospitalER();

        hospital.admitPatient(new Patient(3, "Rahul"));
        hospital.admitPatient(new Patient(1, "Amit"));
        hospital.admitPatient(new Patient(2, "Priya"));

        Patient p = hospital.callNextPatient();

        System.out.println(p.name + " " + p.priority);
    }
}