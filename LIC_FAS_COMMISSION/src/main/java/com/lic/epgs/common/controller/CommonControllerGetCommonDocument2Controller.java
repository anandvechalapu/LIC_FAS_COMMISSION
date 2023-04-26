package com.lic.epgs.common.controller;

import com.lic.epgs.common.document.CommonDocument2;
import com.lic.epgs.common.service.CommonControllerGetCommonDocument2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/common/controller/get/common-document2")
public class CommonControllerGetCommonDocument2Controller {

    @Autowired
    private CommonControllerGetCommonDocument2Service commonControllerGetCommonDocument2Service;

    @GetMapping
    public List<CommonDocument2> findByProductIdAndVariantIdAndDocumentCategoryAndDocumentSubCategory(@RequestParam String productId, @RequestParam String variantId, @RequestParam String documentCategory, @RequestParam String documentSubCategory){
        return commonControllerGetCommonDocument2Service.findByProductIdAndVariantIdAndDocumentCategoryAndDocumentSubCategory(productId, variantId, documentCategory, documentSubCategory);
    }

    @GetMapping("/document-category")
    public List<CommonDocument2> findByProductIdAndVariantIdAndDocumentCategory(@RequestParam String productId, @RequestParam String variantId, @RequestParam String documentCategory){
        return commonControllerGetCommonDocument2Service.findByProductIdAndVariantIdAndDocumentCategory(productId, variantId, documentCategory);
    }

    @GetMapping("/variant-id")
    public List<CommonDocument2> findByProductIdAndVariantId(@RequestParam String productId, @RequestParam String variantId){
        return commonControllerGetCommonDocument2Service.findByProductIdAndVariantId(productId, variantId);
    }

}