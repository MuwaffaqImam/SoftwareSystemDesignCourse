package com.muwaffaq.innopolis.lab12.chain;

public interface Nani {


    /**
     * Chain of responsibility
     */
    default Nani appendAction(Nani nextAction) {
        return new Nani() {
            @Override
            public void action() {
                Nani.this.action();
                nextAction.action();
            }
        };
    }


    void action();


    static Nani cryingBaby() {
        return new Nani() {
            @Override
            public void action() {
                System.out.println("Waring baby is crying");
            }
        };
    }

    static Nani feedBaby() {
        return new Nani() {
            @Override
            public void action() {
                System.out.println("Let's feed the baby some mashed banana! then ->");
            }
        };
    }

    static Nani batheBaby() {
        return new Nani() {
            @Override
            public void action() {
                System.out.println("Let's have a nice bath with our rubber duck! Quaak then->");
            }
        };
    }

    static Nani sleepBaby() {
        return new Nani() {
            @Override
            public void action() {
                System.out.println("Go to sleep go to sleep you are angel go to sleep then->");
            }
        };
    }

}
