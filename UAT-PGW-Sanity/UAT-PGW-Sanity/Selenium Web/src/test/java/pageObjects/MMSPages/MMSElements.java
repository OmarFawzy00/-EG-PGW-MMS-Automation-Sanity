package pageObjects.MMSPages;

import org.openqa.selenium.By;

public class MMSElements {

    public static String credentials = "src/main/resources/credentials.Json";
    public static String data = "src/main/resources/Data.Json";
    public static String filePath = "C://Users/omar.fawzy/Documents/loadMerchants (10).csv";

    public static int min = 10000;
    public static int max = 99999;
    public static int i = 0;

    public static String FirstName ="UAT"+i;
    public static String LastName="Sanity";
    public static String Email =FirstName+LastName+"@endava.com";
    public static String Phonenumber="11111"+i;
    public static String NationalId="294090921"+i;
    public static String BusinessName =FirstName+LastName;
    public static String Comreg=Phonenumber;
    public static String AccountHolder= BusinessName;
    public static String AcquirerNBE = "NBE_BANK";
    public static String AcquirerBM = "DEFAULT_BANK";
    public static String Bundle = "PAYMENT_GATEWAY_BUNDLE";

    public static By usernameField = By.xpath("//*[@id=\"username\"]");
    public static By passwordField = By.xpath("/html/body/div[1]/div[2]/div/div/div/div/form/div[2]/div/div[2]/div[2]/div[2]/input");
    public static By loginButton = By.xpath("//*[@id=\"kc-login\"]");
    public static By merchantListButton = By.xpath("/html/body/ga-root/div/ga-backoffice-layout/div/div/ga-extended-menu-nav/div/ga-extended-menu-nav-sidebar/mat-sidenav-container/mat-sidenav/div/div/mat-nav-list/ga-extended-menu-nav-item[3]/mat-list-item/span/div/div");
    public static By searchField = By.xpath("/html/body/ga-root/div/ga-backoffice-layout/div/div/div/ga-animated-outlet/div/ga-backoffice-merchant-list-page/ga-table/div[1]/ga-table-toolbar/div/div[1]/ga-search-field-improved/mat-form-field/div/div[1]/div[2]/input");
    public static By searchButton = By.xpath("/html/body/ga-root/div/ga-backoffice-layout/div/div/div/ga-animated-outlet/div/ga-backoffice-merchant-list-page/ga-table/div[1]/ga-table-toolbar/div/div[1]/ga-search-field-improved/ga-button/button");
    public static By actionsButton = By.xpath("/html/body/ga-root/div/ga-backoffice-layout/div/div/div/ga-animated-outlet/div/ga-backoffice-merchant-list-page/ga-table/div[2]/table/tbody/tr/td[19]/ga-cell-content/div/div/ga-table-actions/button/span[1]/mat-icon");
    public static By impersonateMerchantButton = By.xpath("//*[text()=' Impersonate merchant ']");
    public static By loadingLogo = By.xpath("/html/body/ga-root/div/div/svg/circle");
    public static By languageButton = By.xpath("//*[@id=\"mat-select-value-1\"]/span/mat-select-trigger");
    public static By englishButton = By.xpath("/html/body/div[2]/div[2]/div/div/div/mat-option[1]");
    public static By systemManagementButton = By.xpath("/html/body/ga-root/div/ga-backoffice-layout/div/div/ga-extended-menu-nav/div/ga-extended-menu-nav-sidebar/mat-sidenav-container/mat-sidenav/div/div/mat-nav-list/ga-extended-menu-nav-item[6]/mat-list-item/span/div/div[1]/div/button");
    public static By merchantImportButton = By.xpath("/html/body/ga-root/div/ga-backoffice-layout/div/div/ga-extended-menu-nav/div/ga-extended-menu-nav-sidebar/mat-sidenav-container/mat-sidenav/div/div/mat-nav-list/ga-extended-menu-nav-item[6]/mat-list-item/span/div/div[2]/span[3]");
    public static By uploadFileButton = By.xpath("//*[@id=\"csvFileUpload\"]");
    public static By uploadMerchantsButton = By.xpath("/html/body/ga-root/div/ga-backoffice-layout/div/div/div/ga-animated-outlet/div/ga-backoffice-merchant-upload-page/div[1]/div/ga-button[2]/button");
    public static By confirmUploadMerchantsButton = By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/ga-confirm-dialog/div/div[2]/ga-button[2]/button");
    public static By viewDetailsButton = By.xpath("//*[text()=' View details ']");
    public static By MCCCodeArrowButton = By.xpath("/html/body/ga-root/div/ga-backoffice-layout/div/div/div/ga-animated-outlet/div/ga-backoffice-merchant-details-page/div[2]/div[1]/div/div[2]/div[8]/ga-autocomplete/mat-form-field/div/div[1]/div[2]/ga-dropdown-arrow");
    public static By ACMCCButton = By.xpath("//*[text()=' Railroads ']");
    public static By editContractButton = By.xpath("/html/body/ga-root/div/ga-backoffice-layout/div/div/div/ga-animated-outlet/div/ga-backoffice-merchant-details-page/div[7]/div[2]/div/table/tbody/tr[1]/td[4]/ga-icon-button/button");
    public static By contractNameButton = By.xpath("/html/body/ga-root/div/ga-backoffice-layout/div/div/div/ga-animated-outlet/div/ga-edit-contract-page/div[3]/ga-autocomplete/mat-form-field/div/div[1]/div[2]/ga-dropdown-arrow/div/mat-icon");
    public static By contractButton = By.xpath("//*[text()=' DFFDDF ']");
    public static By saveContractButton = By.xpath("/html/body/ga-root/div/ga-backoffice-layout/div/div/div/ga-animated-outlet/div/ga-edit-contract-page/div[4]/ga-button[2]/button");
    public static By merchantStatusArrowButton = By.xpath("/html/body/ga-root/div/ga-backoffice-layout/div/div/div/ga-animated-outlet/div/ga-backoffice-merchant-list-page/ga-table/div[2]/table/tbody/tr[1]/td[10]/ga-cell-content/div/div/ga-select/ga-select-field/div/ga-select-arrow");
    public static By verifiedButton = By.xpath("/html/body/div[2]/div[4]/div/ga-select-panel/ga-select-option-list/cdk-virtual-scroll-viewport/div[1]/ga-select-option[10]/div/div/ga-select-autocomplete-label/div");
    public static By signOutButton = By.xpath("//*[text()=' Sign Out ']");
    public static By ordersButton = By.xpath("/html/body/ga-root/div/ga-backoffice-layout/div/div/ga-extended-menu-nav/div/ga-extended-menu-nav-sidebar/mat-sidenav-container/mat-sidenav/div/div/mat-nav-list/ga-extended-menu-nav-item[4]/mat-list-item/span");
    public static By orderStatusButton = By.xpath("/html/body/ga-root/div/ga-backoffice-layout/div/div/div/ga-animated-outlet/div/ga-backoffice-order-list-page/ga-table/div[2]/table/tbody/tr[1]/td[9]/ga-cell-content/div/div/ga-select/ga-select-field/div/ga-select-arrow/div");
    public static By productRegisteredButton = By.xpath("//*[@id=\"cdk-overlay-1\"]/ga-select-panel/ga-select-option-list/cdk-virtual-scroll-viewport/div[1]/ga-select-option[8]");
    public static By MCCFrame = By.xpath("/html/body/iframe[4]");
    public static By actionsForOnboardingMerchantButton = By.xpath("/html/body/ga-root/div/ga-backoffice-layout/div/div/div/ga-animated-outlet/div/ga-backoffice-merchant-list-page/ga-table/div[2]/table/tbody/tr[1]/td[20]/ga-cell-content/div/div/ga-table-actions/button/span[1]/mat-icon");
    public static By profileComplaintsButton = By.xpath("/html/body/ga-root/div/ga-backoffice-layout/div/ga-user-bar/ga-user-bar-extended/div/div/ga-user-menu-button/button/span[1]/div/ga-dropdown-arrow/div/mat-icon");
    public static By editContractOnlinePaymentButton = By.xpath("/html/body/ga-root/div/ga-backoffice-layout/div/div/div/ga-animated-outlet/div/ga-backoffice-merchant-details-page/div[7]/div[2]/div/table/tbody/tr[2]/td[4]/ga-icon-button/button");
    public static By contractOnlinePaymentButton = By.xpath("//*[text()=' NBE PGW ']");
    public static By actionsInOrderListForOnboardingMerchantButton = By.xpath("/html/body/ga-root/div/ga-backoffice-layout/div/div/div/ga-animated-outlet/div/ga-backoffice-order-list-page/ga-table/div[2]/table/tbody/tr[1]/td[18]/ga-cell-content/div/div/ga-table-actions/button");
    public static By viewMerchantStatusButton = By.xpath("//*[text()=' View status history ']");
    public static By expectedOrderStatusButton = By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/ga-status-history-dialog/div/div[2]/ga-status-history-container/div[3]/div/ga-status/div/div/span");
    public static By expectedMerchantStatusButton = By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/ga-status-history-dialog/div/div[2]/ga-status-history-container/div[2]/div/ga-status/div/div/span");
    public static By contractBMButton = By.xpath("//*[text()=' Misr Terminal Standard (Default) ']");
    public static By captcha = By.xpath("/html/body/div[2]/div[3]/div[1]/div/div/span/div[1]");
    public static By reCaptchaFrame = By.xpath("/html/body/div[1]/div[2]/div/div/div/div/form/div[6]/div[1]/div/div/div/div/iframe");
    public static By verificationCodeTextField = By.xpath("//*[@id=\"code\"]");
    public static By verifyButton = By.xpath("//*[@id=\"kc-form-buttons\"]/input");
    public static By ordersSearchTextField = By.xpath("/html/body/ga-root/div/ga-backoffice-layout/div/div/div/ga-animated-outlet/div/ga-backoffice-order-list-page/ga-table/div[1]/ga-table-toolbar/div/div[1]/ga-search-field-improved/mat-form-field/div/div[1]/div[2]/input");
    public static By orderNumberText = By.xpath("/html/body/ga-root/div/ga-backoffice-layout/div/div/div/ga-animated-outlet/div/ga-backoffice-order-list-page/ga-table/div[2]/table/tbody/tr/td[2]");
    public static By orderSearchButton = By.xpath("/html/body/ga-root/div/ga-backoffice-layout/div/div/div/ga-animated-outlet/div/ga-backoffice-order-list-page/ga-table/div[1]/ga-table-toolbar/div/div[1]/ga-search-field-improved/ga-button/button");

}