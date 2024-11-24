package tracking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/assets")
public class AssetTrackingController {

    @Autowired
    private AssetTrackingService assetTrackingService;

    @GetMapping
    public String getAllAssets(Model model) {
        List<Asset> assets = assetTrackingService.getAllAssets();
        model.addAttribute("assets", assets);
        return "assets"; // JSP page that displays assets
    }

    @GetMapping("/{id}")
    public String getAssetById(@PathVariable Long id, Model model) {
        assetTrackingService.getAssetById(id)
                .ifPresent(asset -> model.addAttribute("asset", asset));
        return "asset-details"; // JSP page for asset details
    }

    @PostMapping
    public String addAsset(@ModelAttribute Asset asset) {
        assetTrackingService.saveAsset(asset);
        return "redirect:/assets";
    }

    @DeleteMapping("/{id}")
    public String deleteAsset(@PathVariable Long id) {
        assetTrackingService.deleteAsset(id);
        return "redirect:/assets";
    }
}

