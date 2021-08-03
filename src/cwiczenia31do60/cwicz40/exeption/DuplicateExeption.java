package cwiczenia31do60.cwicz40.exeption;

import cwiczenia31do60.cwicz40.Participant;

public class DuplicateExeption extends RuntimeException{

    private final Participant participant;

    public DuplicateExeption(Participant participant) {
        this.participant = participant;
    }

    public Participant getParticipant() {
        return participant;
    }
}
