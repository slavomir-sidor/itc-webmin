//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2015.11.05 at 12:17:15 PM CET
//

package sk.itcloud.maven.model.form;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Profile implements Serializable
{

	protected String id = "default";
	protected Activation activation;
	protected BuildBase build;
	protected Profile.Modules modules;
	protected DistributionManagement distributionManagement;
	protected Profile.Properties properties;
	protected DependencyManagement dependencyManagement;
	protected Profile.Dependencies dependencies;
	protected Profile.Repositories repositories;
	protected Profile.PluginRepositories pluginRepositories;
	protected Profile.Reports reports;
	protected Reporting reporting;

	/**
	 * Gets the value of the id property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getId()
	{
		return id;
	}

	/**
	 * Sets the value of the id property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setId(String value)
	{
		this.id = value;
	}

	/**
	 * Gets the value of the activation property.
	 * 
	 * @return possible object is {@link Activation }
	 * 
	 */
	public Activation getActivation()
	{
		return activation;
	}

	/**
	 * Sets the value of the activation property.
	 * 
	 * @param value
	 *            allowed object is {@link Activation }
	 * 
	 */
	public void setActivation(Activation value)
	{
		this.activation = value;
	}

	/**
	 * Gets the value of the build property.
	 * 
	 * @return possible object is {@link BuildBase }
	 * 
	 */
	public BuildBase getBuild()
	{
		return build;
	}

	/**
	 * Sets the value of the build property.
	 * 
	 * @param value
	 *            allowed object is {@link BuildBase }
	 * 
	 */
	public void setBuild(BuildBase value)
	{
		this.build = value;
	}

	/**
	 * Gets the value of the modules property.
	 * 
	 * @return possible object is {@link Profile.Modules }
	 * 
	 */
	public Profile.Modules getModules()
	{
		return modules;
	}

	/**
	 * Sets the value of the modules property.
	 * 
	 * @param value
	 *            allowed object is {@link Profile.Modules }
	 * 
	 */
	public void setModules(Profile.Modules value)
	{
		this.modules = value;
	}

	/**
	 * Gets the value of the distributionManagement property.
	 * 
	 * @return possible object is {@link DistributionManagement }
	 * 
	 */
	public DistributionManagement getDistributionManagement()
	{
		return distributionManagement;
	}

	/**
	 * Sets the value of the distributionManagement property.
	 * 
	 * @param value
	 *            allowed object is {@link DistributionManagement }
	 * 
	 */
	public void setDistributionManagement(DistributionManagement value)
	{
		this.distributionManagement = value;
	}

	/**
	 * Gets the value of the properties property.
	 * 
	 * @return possible object is {@link Profile.Properties }
	 * 
	 */
	public Profile.Properties getProperties()
	{
		return properties;
	}

	/**
	 * Sets the value of the properties property.
	 * 
	 * @param value
	 *            allowed object is {@link Profile.Properties }
	 * 
	 */
	public void setProperties(Profile.Properties value)
	{
		this.properties = value;
	}

	/**
	 * Gets the value of the dependencyManagement property.
	 * 
	 * @return possible object is {@link DependencyManagement }
	 * 
	 */
	public DependencyManagement getDependencyManagement()
	{
		return dependencyManagement;
	}

	/**
	 * Sets the value of the dependencyManagement property.
	 * 
	 * @param value
	 *            allowed object is {@link DependencyManagement }
	 * 
	 */
	public void setDependencyManagement(DependencyManagement value)
	{
		this.dependencyManagement = value;
	}

	/**
	 * Gets the value of the dependencies property.
	 * 
	 * @return possible object is {@link Profile.Dependencies }
	 * 
	 */
	public Profile.Dependencies getDependencies()
	{
		return dependencies;
	}

	/**
	 * Sets the value of the dependencies property.
	 * 
	 * @param value
	 *            allowed object is {@link Profile.Dependencies }
	 * 
	 */
	public void setDependencies(Profile.Dependencies value)
	{
		this.dependencies = value;
	}

	/**
	 * Gets the value of the repositories property.
	 * 
	 * @return possible object is {@link Profile.Repositories }
	 * 
	 */
	public Profile.Repositories getRepositories()
	{
		return repositories;
	}

	/**
	 * Sets the value of the repositories property.
	 * 
	 * @param value
	 *            allowed object is {@link Profile.Repositories }
	 * 
	 */
	public void setRepositories(Profile.Repositories value)
	{
		this.repositories = value;
	}

	/**
	 * Gets the value of the pluginRepositories property.
	 * 
	 * @return possible object is {@link Profile.PluginRepositories }
	 * 
	 */
	public Profile.PluginRepositories getPluginRepositories()
	{
		return pluginRepositories;
	}

	/**
	 * Sets the value of the pluginRepositories property.
	 * 
	 * @param value
	 *            allowed object is {@link Profile.PluginRepositories }
	 * 
	 */
	public void setPluginRepositories(Profile.PluginRepositories value)
	{
		this.pluginRepositories = value;
	}

	/**
	 * Gets the value of the reports property.
	 * 
	 * @return possible object is {@link Profile.Reports }
	 * 
	 */
	public Profile.Reports getReports()
	{
		return reports;
	}

	/**
	 * Sets the value of the reports property.
	 * 
	 * @param value
	 *            allowed object is {@link Profile.Reports }
	 * 
	 */
	public void setReports(Profile.Reports value)
	{
		this.reports = value;
	}

	/**
	 * Gets the value of the reporting property.
	 * 
	 * @return possible object is {@link Reporting }
	 * 
	 */
	public Reporting getReporting()
	{
		return reporting;
	}

	/**
	 * Sets the value of the reporting property.
	 * 
	 * @param value
	 *            allowed object is {@link Reporting }
	 * 
	 */
	public void setReporting(Reporting value)
	{
		this.reporting = value;
	}

	/**
	 * <p>
	 * Java class for anonymous complex type.
	 * 
	 * <p>
	 * The following schema fragment specifies the expected content contained within this class.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="dependency" type="{http://maven.apache.org/POM/4.0.0}Dependency" maxOccurs="unbounded" minOccurs="0"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	public static class Dependencies
	{

		protected List<Dependency> dependency;

		/**
		 * Gets the value of the dependency property.
		 * 
		 * <p>
		 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be
		 * present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for the dependency property.
		 * 
		 * <p>
		 * For example, to add a new item, do as follows:
		 * 
		 * <pre>
		 * getDependency().add(newItem);
		 * </pre>
		 * 
		 * 
		 * <p>
		 * Objects of the following type(s) are allowed in the list {@link Dependency }
		 * 
		 * 
		 */
		public List<Dependency> getDependency()
		{
			if (dependency == null)
			{
				dependency = new ArrayList<Dependency>();
			}
			return this.dependency;
		}

	}

	/**
	 * <p>
	 * Java class for anonymous complex type.
	 * 
	 * <p>
	 * The following schema fragment specifies the expected content contained within this class.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="module" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	public static class Modules
	{

		protected List<String> module;

		/**
		 * Gets the value of the module property.
		 * 
		 * <p>
		 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be
		 * present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for the module property.
		 * 
		 * <p>
		 * For example, to add a new item, do as follows:
		 * 
		 * <pre>
		 * getModule().add(newItem);
		 * </pre>
		 * 
		 * 
		 * <p>
		 * Objects of the following type(s) are allowed in the list {@link String }
		 * 
		 * 
		 */
		public List<String> getModule()
		{
			if (module == null)
			{
				module = new ArrayList<String>();
			}
			return this.module;
		}

	}

	/**
	 * <p>
	 * Java class for anonymous complex type.
	 * 
	 * <p>
	 * The following schema fragment specifies the expected content contained within this class.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="pluginRepository" type="{http://maven.apache.org/POM/4.0.0}Repository" maxOccurs="unbounded" minOccurs="0"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	public static class PluginRepositories
	{

		protected List<Repository> pluginRepository;

		/**
		 * Gets the value of the pluginRepository property.
		 * 
		 * <p>
		 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be
		 * present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for the pluginRepository property.
		 * 
		 * <p>
		 * For example, to add a new item, do as follows:
		 * 
		 * <pre>
		 * getPluginRepository().add(newItem);
		 * </pre>
		 * 
		 * 
		 * <p>
		 * Objects of the following type(s) are allowed in the list {@link Repository }
		 * 
		 * 
		 */
		public List<Repository> getPluginRepository()
		{
			if (pluginRepository == null)
			{
				pluginRepository = new ArrayList<Repository>();
			}
			return this.pluginRepository;
		}

	}

	/**
	 * <p>
	 * Java class for anonymous complex type.
	 * 
	 * <p>
	 * The following schema fragment specifies the expected content contained within this class.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;any processContents='skip' maxOccurs="unbounded" minOccurs="0"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	public static class Properties
	{

	}

	/**
	 * <p>
	 * Java class for anonymous complex type.
	 * 
	 * <p>
	 * The following schema fragment specifies the expected content contained within this class.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;any processContents='skip' maxOccurs="unbounded" minOccurs="0"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	public static class Reports
	{

	}

	/**
	 * <p>
	 * Java class for anonymous complex type.
	 * 
	 * <p>
	 * The following schema fragment specifies the expected content contained within this class.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="repository" type="{http://maven.apache.org/POM/4.0.0}Repository" maxOccurs="unbounded" minOccurs="0"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	public static class Repositories
	{

		protected List<Repository> repository;

		/**
		 * Gets the value of the repository property.
		 * 
		 * <p>
		 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be
		 * present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for the repository property.
		 * 
		 * <p>
		 * For example, to add a new item, do as follows:
		 * 
		 * <pre>
		 * getRepository().add(newItem);
		 * </pre>
		 * 
		 * 
		 * <p>
		 * Objects of the following type(s) are allowed in the list {@link Repository }
		 * 
		 * 
		 */
		public List<Repository> getRepository()
		{
			if (repository == null)
			{
				repository = new ArrayList<Repository>();
			}
			return this.repository;
		}

	}

}