package WEB.servlet.tp_Servlet_Jdbc;

public class Article {

	private Integer id;
	private Integer numArticle;
	private String type;
	private String nom;
	private String description;
	
	
	
	
	public Article() {
		super();
	}
	
	
	public Article(Integer numArticle, String type, String nom, String description) {
		super();
		this.numArticle = numArticle;
		this.type = type;
		this.nom = nom;
		this.description = description;
	}
	
	
	
	
	
	@Override
	public String toString() {
		return "Article [id=" + id + ", numArticle=" + numArticle + ", type=" + type + ", nom=" + nom + ", description="
				+ description + "]";
	}

	
	
	

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getNumArticle() {
		return numArticle;
	}
	public void setNumArticle(Integer numArticle) {
		this.numArticle = numArticle;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}




}
