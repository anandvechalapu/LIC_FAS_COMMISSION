@Entity
@Table(name = "common_document2")
@Getter
@Setter
public class CommonDocument2 implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "product_id")
    private String productId;

    @Column(name = "variant_id")
    private String variantId;

    @Column(name = "document_category")
    private String documentCategory;

    @Column(name = "document_sub_category")
    private String documentSubCategory;

    @Column(name = "document_name")
    private String documentName;

    @Column(name = "document_data")
    private String documentData;

}