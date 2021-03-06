package uk.ac.ebi.pride.archive.repo.models.project;

import uk.ac.ebi.pride.archive.dataprovider.project.ProjectTagProvider;

/**
 * @author Jose A. Dianes
 * @version $Id$
 */
public class ProjectTagSummary implements ProjectTagProvider {

  private String tag;

  private Long id;

  @Override
  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }

  @Override
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }
}
