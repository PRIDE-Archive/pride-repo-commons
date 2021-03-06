package uk.ac.ebi.pride.archive.repo.models.assay.software;

import uk.ac.ebi.pride.archive.dataprovider.data.software.SoftwareProvider;
import uk.ac.ebi.pride.archive.repo.models.param.ParamSummary;
import uk.ac.ebi.pride.archive.repo.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author Rui Wang
 * @version $Id$
 */
public class SoftwareSummary implements SoftwareProvider {

  private int order;
  private String name;
  private List<String> customization;
  private String version;
  private Long id;
  private Collection<ParamSummary> params;

  public SoftwareSummary() {
    this.params = new ArrayList<>();
  }

  public int getOrder() {
    return order;
  }

  public void setOrder(int order) {
    this.order = order;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<String> getCustomization() {
    return customization;
  }

  public void setCustomization(List<String> customization) {
    this.customization = customization;
  }

  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Collection<ParamSummary> getParams() {
    return params;
  }

  public void setParams(Collection<ParamSummary> params) {
    CollectionUtils.replaceValuesInCollection(params, this.params);
  }

  @Override
  public Collection<? extends String> getAdditionalAttributesStrings() {
    return null;
  }
}
