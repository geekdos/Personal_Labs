package project;

public class SommeArgent {
	private int quantite;
	private String unite;

	public SommeArgent(int quantite, String unite) {
		super();
		this.quantite = quantite;
		this.unite = unite;
	}

	public int getQuantite() {
		return quantite;
	}

	public String getUnite() {
		return unite;
	}

	public SommeArgent add(SommeArgent m) throws UniteDistincteException {
		if (!m.getUnite().equals(this.getUnite())) {
			throw new UniteDistincteException(this, m);
		}else
			return new SommeArgent(getQuantite() + m.getQuantite(), getUnite());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + quantite;
		result = prime * result + ((unite == null) ? 0 : unite.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SommeArgent other = (SommeArgent) obj;
		if (quantite != other.quantite)
			return false;
		if (unite == null) {
			if (other.unite != null)
				return false;
		} else if (!unite.equals(other.unite))
			return false;
		return true;
	}
	/*
	@Override
	public boolean equals(Object anObject) {
		if (anObject == null)
			return false;
		if (anObject instanceof SommeArgent) {
			SommeArgent aMoney = (SommeArgent) anObject;
			return aMoney.getUnite().equals(getUnite()) && getQuantite() == aMoney.getQuantite();
		}
		return false;
	}
	*/
	
}
