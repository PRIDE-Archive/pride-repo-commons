package uk.ac.ebi.pride.archive.repo.models.stats;

/**
 * @author Jose A. Dianes
 * @version $Id$
 */
public class StatisticsSummary {
  private long numProjects;
  private long numAssay;
  private int numTotalSpectra;
  private int numIdentifiedSpectra;
  private int numPeptides;
  private int numUniquePeptides;
  private int numProteins;

  public int getNumPeptides() {
    return numPeptides;
  }

  public void setNumPeptides(int numPeptides) {
    this.numPeptides = numPeptides;
  }

  public int getNumUniquePeptides() {
    return numUniquePeptides;
  }

  public void setNumUniquePeptides(int numUniquePeptides) {
    this.numUniquePeptides = numUniquePeptides;
  }

  public int getNumProteins() {
    return numProteins;
  }

  public void setNumProteins(int numProteins) {
    this.numProteins = numProteins;
  }

  public long getNumProjects() {
    return numProjects;
  }

  public void setNumProjects(long numProjects) {
    this.numProjects = numProjects;
  }

  public long getNumAssay() {
    return numAssay;
  }

  public void setNumAssay(long numAssay) {
    this.numAssay = numAssay;
  }

  public int getNumTotalSpectra() {
    return numTotalSpectra;
  }

  public void setNumTotalSpectra(int numTotalSpectra) {
    this.numTotalSpectra = numTotalSpectra;
  }

  public int getNumIdentifiedSpectra() {
    return numIdentifiedSpectra;
  }

  public void setNumIdentifiedSpectra(int numIdentifiedSpectra) {
    this.numIdentifiedSpectra = numIdentifiedSpectra;
  }
}
