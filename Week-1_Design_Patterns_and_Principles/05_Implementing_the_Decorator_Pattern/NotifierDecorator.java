public abstract class NotifierDecorator implements Notifier { //Decorator (acts as base for other concrete decorators)
    protected Notifier wrappee;
    public NotifierDecorator(Notifier n) { 
        this.wrappee = n; 
    }
}

