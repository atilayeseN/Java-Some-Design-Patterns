
public class Developers implements Workers{
Workers[] workers;
public Developers() {
	workers = new Workers[] {new Backend(), new Frontend(), new Accountant()};
}

@Override
public void accept(Manager mng) {
	for (int i = 0; i < workers.length; i++) {
        workers[i].accept(mng);
     }
     mng.visit(this);
	
}
}
