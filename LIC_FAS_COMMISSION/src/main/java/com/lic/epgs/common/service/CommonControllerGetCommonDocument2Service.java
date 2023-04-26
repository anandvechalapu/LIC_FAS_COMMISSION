package com.lic.epgs.common.service;

import com.lic.epgs.common.document.CommonDocument2;
import com.lic.epgs.common.repository.CommonControllerGetCommonDocument2Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommonControllerGetCommonDocument2Service {

    @Autowired
    private CommonControllerGetCommonDocument2Repository commonControllerGetCommonDocument2Repository;

    public List<CommonDocument2> findByProductIdAndVariantIdAndDocumentCategoryAndDocumentSubCategory(String productId, String variantId, String documentCategory, String documentSubCategory){
        return commonControllerGetCommonDocument2Repository.findByProductIdAndVariantIdAndDocumentCategoryAndDocumentSubCategory(productId, variantId, documentCategory, documentSubCategory);
    }

    public List<CommonDocument2> findByProductIdAndVariantIdAndDocumentCategory(String productId, String variantId, String documentCategory){
        return commonControllerGetCommonDocument2Repository.findByProductIdAndVariantIdAndDocumentCategory(productId, variantId, documentCategory);
    }

    public List<CommonDocument2> findByProductIdAndVariantId(String productId, String variantId){
        return commonControllerGetCommonDocument2Repository.findByProductIdAndVariantId(productId, variantId);
    }

}