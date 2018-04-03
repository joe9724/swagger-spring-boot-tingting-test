package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Book;
import io.swagger.model.Response;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineResponse2007
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-03T13:27:38.359Z")

public class InlineResponse2007   {
  @JsonProperty("status")
  private Response status = null;

  @JsonProperty("books")
  @Valid
  private List<Book> books = null;

  public InlineResponse2007 status(Response status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Response getStatus() {
    return status;
  }

  public void setStatus(Response status) {
    this.status = status;
  }

  public InlineResponse2007 books(List<Book> books) {
    this.books = books;
    return this;
  }

  public InlineResponse2007 addBooksItem(Book booksItem) {
    if (this.books == null) {
      this.books = new ArrayList<Book>();
    }
    this.books.add(booksItem);
    return this;
  }

   /**
   * Get books
   * @return books
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Book> getBooks() {
    return books;
  }

  public void setBooks(List<Book> books) {
    this.books = books;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2007 inlineResponse2007 = (InlineResponse2007) o;
    return Objects.equals(this.status, inlineResponse2007.status) &&
        Objects.equals(this.books, inlineResponse2007.books);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, books);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2007 {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    books: ").append(toIndentedString(books)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

