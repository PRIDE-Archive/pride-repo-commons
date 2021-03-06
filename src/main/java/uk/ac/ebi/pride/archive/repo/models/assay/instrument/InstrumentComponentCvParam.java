package uk.ac.ebi.pride.archive.repo.models.assay.instrument;

import com.fasterxml.jackson.annotation.*;
import uk.ac.ebi.pride.archive.dataprovider.param.CvParamProvider;
import uk.ac.ebi.pride.archive.repo.models.param.CvParam;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * @author Jose A. Dianes
 * @version $Id$
 */
@Entity
@Table(name = "instrument_component_cvparam")
@SequenceGenerator(
  name = "InstrumentComponentParamSequence",
  sequenceName = "instrCompParamSequence",
  allocationSize = 100
)
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property="id", scope= InstrumentComponentCvParam.class)
public class InstrumentComponentCvParam implements CvParamProvider {

  @Id
  @GeneratedValue(
    strategy = GenerationType.SEQUENCE,
    generator = "InstrumentComponentParamSequence"
  )
  @Column(name = "param_pk")
  private Long id;

  @NotNull
  @ManyToOne
  @JoinColumn(name = "instrument_component_fk", nullable = false)
//  @JsonBackReference(value = "InstrumentComponentCvParam-instrumentComponent")
  private InstrumentComponent instrumentComponent;

  @NotNull
  @ManyToOne(cascade = {CascadeType.MERGE})
  @JoinColumn(name = "cv_param_fk")
  private CvParam cvParam;

  @Column(name = "value")
  private String value;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  @JsonIgnore
  public String getCvLabel() {
    return cvParam.getCvLabel();
  }

  @JsonIgnore
  public String getAccession() {
    return cvParam.getAccession();
  }

  @JsonIgnore
  public String getName() {
    return cvParam.getName();
  }

  public String getValue() {
    return this.value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public InstrumentComponent getInstrumentComponent() {
    return instrumentComponent;
  }

  public void setInstrumentComponent(InstrumentComponent instrumentComponent) {
    this.instrumentComponent = instrumentComponent;
  }

  public CvParam getCvParam() {
    return cvParam;
  }

  public void setCvParam(CvParam cvParam) {
    this.cvParam = cvParam;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof InstrumentComponentCvParam)) return false;

    InstrumentComponentCvParam that = (InstrumentComponentCvParam) o;

    if (cvParam != null ? !cvParam.equals(that.cvParam) : that.cvParam != null) return false;
    return value != null ? value.equals(that.value) : that.value == null;
  }

  @Override
  public int hashCode() {
    int result = cvParam != null ? cvParam.hashCode() : 0;
    result = 31 * result + (value != null ? value.hashCode() : 0);
    return result;
  }
}
