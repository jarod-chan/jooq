/**
 * This class is generated by jOOQ
 */
package jooq.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.2" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Author implements java.io.Serializable {

	private static final long serialVersionUID = 465263438;

	private java.lang.Integer id;
	private java.lang.String  firstName;
	private java.lang.String  lastName;

	public Author() {}

	public Author(
		java.lang.Integer id,
		java.lang.String  firstName,
		java.lang.String  lastName
	) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public java.lang.Integer getId() {
		return this.id;
	}

	public void setId(java.lang.Integer id) {
		this.id = id;
	}

	public java.lang.String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(java.lang.String firstName) {
		this.firstName = firstName;
	}

	public java.lang.String getLastName() {
		return this.lastName;
	}

	public void setLastName(java.lang.String lastName) {
		this.lastName = lastName;
	}
}