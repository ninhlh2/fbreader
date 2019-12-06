package org.geometerplus.fbreader.network.tree;

import org.geometerplus.zlibrary.core.image.ZLImage;
import org.geometerplus.zlibrary.core.network.ZLNetworkException;
import org.geometerplus.zlibrary.core.money.Money;

import org.geometerplus.fbreader.network.TopUpItem;
import org.geometerplus.fbreader.network.NetworkTree;
import org.geometerplus.fbreader.network.authentication.NetworkAuthenticationManager;

public class TopUpTree extends NetworkTree {
	public final TopUpItem Item;

	TopUpTree(NetworkCatalogTree parentTree, TopUpItem item) {
		super(parentTree);
		Item = item;
	}

	@Override
	public String getName() {
		return Item.Title.toString();
	}

	@Override
	public String getSummary() {
		final NetworkAuthenticationManager mgr = getLink().authenticationManager();
		try {
			if (mgr != null && mgr.isAuthorised(false)) {
				final Money account = mgr.currentAccount();
				final CharSequence summary = Item.getSummary();
				if (account != null && summary != null) {
					return summary.toString().replace("%s", account.toString());
				}
			}
		} catch (ZLNetworkException e) {
		}
		return null;
	}

	@Override
	protected ZLImage createCover() {
		return createCoverForItem(Library, Item, true);
	}

	@Override
	protected String getStringId() {
		return "@TopUp Account";
	}
}
