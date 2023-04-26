@Repository
public interface CommonControllerGetCommonDocument2Repository extends JpaRepository<CommonDocument2, Long> {
    
    @Query(value = "SELECT * FROM common_document2 WHERE product_id = ?1 AND variant_id = ?2 AND document_category = ?3 AND document_sub_category = ?4", nativeQuery = true)
    List<CommonDocument2> findByProductIdAndVariantIdAndDocumentCategoryAndDocumentSubCategory(String productId, String variantId, String documentCategory, String documentSubCategory);

    @Query(value = "SELECT * FROM common_document2 WHERE product_id = ?1 AND variant_id = ?2 AND document_category = ?3", nativeQuery = true)
    List<CommonDocument2> findByProductIdAndVariantIdAndDocumentCategory(String productId, String variantId, String documentCategory);

    @Query(value = "SELECT * FROM common_document2 WHERE product_id = ?1 AND variant_id = ?2", nativeQuery = true)
    List<CommonDocument2> findByProductIdAndVariantId(String productId, String variantId);
}